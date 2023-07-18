/*
 * Copyright 2023 QuiltMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.quiltmc.loader.impl.gui;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.quiltmc.loader.api.FasterFiles;
import org.quiltmc.loader.api.LoaderValue;
import org.quiltmc.loader.api.LoaderValue.LArray;
import org.quiltmc.loader.api.LoaderValue.LObject;
import org.quiltmc.loader.api.gui.QuiltDisplayedError;
import org.quiltmc.loader.api.gui.QuiltLoaderGui;
import org.quiltmc.loader.api.gui.QuiltLoaderIcon;
import org.quiltmc.loader.api.gui.QuiltLoaderText;
import org.quiltmc.loader.api.plugin.LoaderValueFactory;
import org.quiltmc.loader.impl.gui.QuiltJsonGui.QuiltBasicButtonAction;
import org.quiltmc.loader.impl.util.QuiltLoaderInternal;
import org.quiltmc.loader.impl.util.QuiltLoaderInternalType;

@QuiltLoaderInternal(QuiltLoaderInternalType.NEW_INTERNAL)
public final class QuiltJsonGuiMessage extends QuiltGuiSyncBase implements QuiltDisplayedError {

	interface QuiltMessageListener {
		default void onFixed() {}
		default void onIconChanged() {}
		default void onTitleChanged() {}
		default void onDescriptionChanged() {}
		default void onAdditionalInfoChanged() {}
	}

	private static final String DEFAULT_ICON = new String("level_error");

	boolean fixed = false;

	// Gui fields
	public String title;
	public String iconType = DEFAULT_ICON;
	public final List<String> description = new ArrayList<>();
	public final List<String> additionalInfo = new ArrayList<>();

	public final List<QuiltJsonButton> buttons = new ArrayList<>();

	public String subMessageHeader = "";
	public final List<QuiltJsonGuiMessage> subMessages = new ArrayList<>();

	final List<QuiltMessageListener> listeners = new ArrayList<>();

	// Report fields
	final String reportingPlugin;
	final Throwable reportTrace;
	public int ordering = 0;
	final List<String> reportLines = new ArrayList<>();
	final List<Throwable> exceptions = new ArrayList<>();

	public QuiltJsonGuiMessage(QuiltGuiSyncBase parent, String reporter, QuiltLoaderText title) {
		super(parent);
		reportTrace = new Throwable();
		this.reportingPlugin = reporter;
		this.title = title.toString();
	}

	public QuiltJsonGuiMessage(QuiltGuiSyncBase parent, LoaderValue.LObject obj) throws IOException {
		super(parent, obj);
		this.reportingPlugin = null;
		reportTrace = null;
		title = HELPER.expectString(obj, "title");
		iconType = HELPER.expectString(obj, "icon");
		subMessageHeader = HELPER.expectString(obj, "sub_message_header");

		for (LoaderValue sub : HELPER.expectArray(obj, "description")) {
			description.add(sub.asString());
		}

		for (LoaderValue sub : HELPER.expectArray(obj, "info")) {
			additionalInfo.add(sub.asString());
		}

		for (LoaderValue sub : HELPER.expectArray(obj, "buttons")) {
			buttons.add(readChild(sub, QuiltJsonButton.class));
		}

		for (LoaderValue sub : HELPER.expectArray(obj, "sub_messages")) {
			subMessages.add(readChild(sub, QuiltJsonGuiMessage.class));
		}
	}

	@Override
	String syncType() {
		return "message";
	}

	@Override
	protected void write0(Map<String, LoaderValue> map) {
		map.put("title", lvf().string(title));
		map.put("icon", lvf().string(iconType));
		map.put("description", stringArray(description));
		map.put("info", stringArray(additionalInfo));
		map.put("buttons", lvf().array(write(buttons)));
		map.put("sub_message_header", lvf().string(subMessageHeader));
		map.put("sub_messages", lvf().array(write(subMessages)));
	}

	private static LoaderValue stringArray(List<String> list) {
		int i = 0;
		LoaderValue[] values = new LoaderValue[list.size()];
		for (String str : list) {
			values[i++] = lvf().string(str);
		}
		return lvf().array(values);
	}

	@Override
	public QuiltDisplayedError appendReportText(String... lines) {
		Collections.addAll(reportLines, lines);
		return this;
	}

	@Override
	public QuiltDisplayedError appendDescription(QuiltLoaderText... descriptions) {
		int fromIndex = description.size();
		for (QuiltLoaderText text : descriptions) {
			Collections.addAll(description, text.toString().split("\\n"));
		}
		if (shouldSendUpdates()) {
			int toIndex = description.size();
			Map<String, LoaderValue> map = new HashMap<>();
			LoaderValue[] array = new LoaderValue[toIndex - fromIndex];
			for (int i = 0; i < array.length; i++) {
				array[i] = lvf().string(description.get(i + fromIndex));
			}
			map.put("add", lvf().array(array));
			sendUpdate("description", lvf().object(map));
		}
		return this;
	}

	@Override
	public QuiltDisplayedError clearDescription() {
		description.clear();
		if (shouldSendUpdates()) {
			sendSignal("clear_description");
		}
		return this;
	}

	@Override
	public QuiltDisplayedError setOrdering(int priority) {
		this.ordering = priority;
		return this;
	}

	@Override
	public QuiltDisplayedError appendAdditionalInformation(QuiltLoaderText... information) {
		int fromIndex = additionalInfo.size();
		for (QuiltLoaderText text : information) {
			Collections.addAll(additionalInfo, text.toString().split("\\n"));
		}
		if (shouldSendUpdates()) {
			int toIndex = additionalInfo.size();
			Map<String, LoaderValue> map = new HashMap<>();
			LoaderValue[] array = new LoaderValue[toIndex - fromIndex];
			for (int i = 0; i < array.length; i++) {
				array[i] = lvf().string(additionalInfo.get(i + fromIndex));
			}
			map.put("add", lvf().array(array));
			sendUpdate("additional_info", lvf().object(map));
		}
		return this;
	}

	@Override
	public QuiltDisplayedError clearAdditionalInformation() {
		additionalInfo.clear();
		if (shouldSendUpdates()) {
			sendSignal("clear_additional_info");
		}
		return this;
	}

	@Override
	public QuiltDisplayedError appendThrowable(Throwable t) {
		exceptions.add(t);
		return this;
	}

	@Override
	public QuiltDisplayedError setIcon(QuiltLoaderIcon icon) {
		this.iconType = PluginIconImpl.fromApi(icon).path;
		if (shouldSendUpdates()) {
			Map<String, LoaderValue> map = new HashMap<>();
			map.put("icon", lvf().string(iconType));
			sendUpdate("set_icon", lvf().object(map));
		}
		return this;
	}

	private QuiltJsonButton button(QuiltLoaderText name, QuiltBasicButtonAction action) {
		return button(name, action, null);
	}

	private QuiltJsonButton button(QuiltLoaderText name, QuiltBasicButtonAction action, Runnable run) {
		QuiltJsonButton button = new QuiltJsonButton(this, name.toString(), action.defaultIcon, action, run);
		buttons.add(button);
		return button;
	}

	@Override
	public QuiltErrorButton addFileViewButton(QuiltLoaderText name, Path openedPath) {
		return button(name, QuiltBasicButtonAction.VIEW_FILE).arg("file", openedPath.toString());
	}

	@Override
	public QuiltErrorButton addFileEditButton(QuiltLoaderText name, Path openedPath) {
		return button(name, QuiltBasicButtonAction.EDIT_FILE).arg("file", openedPath.toString());
	}

	@Override
	public QuiltErrorButton addFolderViewButton(QuiltLoaderText name, Path openedFolder) {
		if (FasterFiles.isRegularFile(openedFolder)) {
			return addFileViewButton(name, openedFolder);
		} else {
			return button(name, QuiltBasicButtonAction.VIEW_FOLDER).arg("folder", openedFolder.toString());
		}
	}

	@Override
	public QuiltErrorButton addOpenLinkButton(QuiltLoaderText name, String url) {
		return button(name, QuiltBasicButtonAction.OPEN_WEB_URL).arg("url", url);
	}

	@Override
	public QuiltErrorButton addOpenQuiltSupportButton() {
		QuiltJsonButton button = QuiltJsonButton.createUserSupportButton(this);
		buttons.add(button);
		return button;
	}

	@Override
	public QuiltErrorButton addCopyTextToClipboardButton(QuiltLoaderText name, String fullText) {
		return button(name, QuiltBasicButtonAction.PASTE_CLIPBOARD_TEXT).arg("text", fullText);
	}

	@Override
	public QuiltErrorButton addCopyFileToClipboardButton(QuiltLoaderText name, Path openedFile) {
		return button(name, QuiltBasicButtonAction.PASTE_CLIPBOARD_FILE).arg("file", openedFile.toString());
	}

	@Override
	public QuiltErrorButton addOnceActionButton(QuiltLoaderText name, QuiltLoaderText disabledText, Runnable action) {
		QuiltJsonButton button = button(name, QuiltBasicButtonAction.RETURN_SIGNAL_ONCE, action);
		button.disabledText = disabledText.toString();
		return button;
	}

	@Override
	public QuiltErrorButton addActionButton(QuiltLoaderText name, Runnable action) {
		return button(name, QuiltBasicButtonAction.RETURN_SIGNAL_MANY, action);
	}

	@Override
	public void setFixed() {
		fixed = true;
		if (/* Intentional identity check */ iconType == DEFAULT_ICON) {
			setIcon(QuiltLoaderGui.iconTick());
		}
		if (shouldSendUpdates()) {
			sendSignal("fixed");
		}
		for (QuiltMessageListener l : listeners) {
			l.onFixed();
		}
	}

	public boolean isFixed() {
		return fixed;
	}

	@Override
	void handleUpdate(String name, LObject data) throws IOException {
		switch (name) {
			case "fixed": {
				this.fixed = true;
				for (QuiltMessageListener l : listeners) {
					l.onFixed();
				}
				return;
			}
			case "clear_description": {
				description.clear();
				for (QuiltMessageListener l : listeners) {
					l.onDescriptionChanged();
				}
				return;
			}
			case "clear_additional_info": {
				additionalInfo.clear();
				for (QuiltMessageListener l : listeners) {
					l.onAdditionalInfoChanged();
				}
				return;
			}
			case "description":
			case "additional_info": {
				boolean isDescription = name.startsWith("d");

				LArray lines = HELPER.expectArray(data, "add");
				for (int i = 0; i < lines.size(); i++) {
					String line = HELPER.expectString(lines.get(i));
					(isDescription ? description : additionalInfo).add(line);
				}

				for (QuiltMessageListener l : listeners) {
					if (isDescription) {
						l.onDescriptionChanged();
					} else {
						l.onAdditionalInfoChanged();
					}
				}
				return;
			}
			case "set_icon": {
				iconType = HELPER.expectString(data, "icon");
				for (QuiltMessageListener l : listeners) {
					l.onIconChanged();
				}
				return;
			}
			default: {
				throw new IOException("Unhandled update '" + name + "'");
			}
		}
	}

	public List<String> toReportText() {
		List<String> lines = new ArrayList<>();
		lines.addAll(reportLines);

		if (lines.isEmpty()) {
			lines.add("The plugin that created this error (" + reportingPlugin + ") forgot to call 'appendReportText'!");
			lines.add("The next stacktrace is where the plugin created the error, not the actual error.'");
			exceptions.add(0, reportTrace);
		}

		for (Throwable ex : exceptions) {
			lines.add("");
			StringWriter writer = new StringWriter();
			ex.printStackTrace(new PrintWriter(writer));
			Collections.addAll(lines, writer.toString().split("\n"));
		}
		return lines;
	}
}
