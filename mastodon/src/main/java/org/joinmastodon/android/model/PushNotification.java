package org.joinmastodon.android.model;

import com.google.gson.annotations.SerializedName;

import org.joinmastodon.android.R;
import org.joinmastodon.android.api.RequiredField;

import androidx.annotation.StringRes;

public class PushNotification extends BaseModel{
	public String accessToken;
	public String preferredLocale;
	public long notificationId;
	@RequiredField
	public Type notificationType;
	@RequiredField
	public String icon;
	@RequiredField
	public String title;
	@RequiredField
	public String body;

	@Override
	public String toString(){
		return "PushNotification{"+
				"accessToken='"+accessToken+'\''+
				", preferredLocale='"+preferredLocale+'\''+
				", notificationId="+notificationId+
				", notificationType="+notificationType+
				", icon='"+icon+'\''+
				", title='"+title+'\''+
				", body='"+body+'\''+
				'}';
	}

	public enum Type{
		@SerializedName("favourite")
		FAVORITE(R.string.notification_type_favorite),
		@SerializedName("mention")
		MENTION(R.string.notification_type_mention),
		@SerializedName("reblog")
		REBLOG(R.string.notification_type_reblog),
		@SerializedName("follow")
		FOLLOW(R.string.notification_type_follow),
		@SerializedName("poll")
		POLL(R.string.notification_type_poll),
		@SerializedName("status")
		STATUS(R.string.sk_notification_type_status),
		@SerializedName("update")
		UPDATE(R.string.sk_notification_type_update),
		@SerializedName("admin.sign_up")
		SIGN_UP(R.string.sk_sign_ups),
		@SerializedName("admin.report")
		REPORT(R.string.sk_new_reports);

		@StringRes
		public final int localizedName;

		Type(int localizedName){
			this.localizedName=localizedName;
		}
	}
}
