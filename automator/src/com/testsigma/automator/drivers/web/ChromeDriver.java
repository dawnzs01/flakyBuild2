package com.testsigma.automator.drivers.web;

import com.testsigma.automator.drivers.WebDriverCapability;
import com.testsigma.automator.exceptions.AutomatorException;
import com.testsigma.automator.utilities.PathUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
@Log4j2
public class ChromeDriver extends WebDriver {

  ChromeOptions chromeOptions;

  public ChromeDriver() {
    super();
    chromeOptions = new ChromeOptions();
  }

  @Override
  protected void createDriverInstance(DesiredCapabilities desiredCapabilities) throws AutomatorException {
    chromeOptions = chromeOptions.merge(desiredCapabilities);
    log.info("chromeOptions::: " + chromeOptions);
    if (remoteServerURL != null) {
      remoteWebDriver = new RemoteWebDriver(remoteServerURL, chromeOptions);
    } else {
      remoteWebDriver = new org.openqa.selenium.chrome.ChromeDriver(chromeOptions);
    }
  }

  @Override
  protected void setTestsigmaLabCapabilities() throws AutomatorException {
    super.setTestsigmaLabCapabilities();
  }

  @Override
  public void setHybridCapabilities() throws AutomatorException, MalformedURLException {
    super.setHybridCapabilities();
  }

  @Override
  protected void setBrowserSpecificCapabilities(List<WebDriverCapability> additionalCapabilitiesList) throws AutomatorException {
    if (additionalCapabilitiesList != null) {
      for (Iterator<WebDriverCapability> single = additionalCapabilitiesList.listIterator(); single.hasNext(); ) {
        WebDriverCapability singleCap = single.next();
        String name = singleCap.getCapabilityName();

        if (ChromeOptions.CAPABILITY.equals(name)) {
          String values = singleCap.getCapabilityValue().toString();
          Map<String, Object> option = parseCapabilities(values, "ChromeOptions");
          if (option.get("args") != null) {
            List<Object> list = (List<Object>) option.get("args");
            for (Object str : list) {
              chromeOptions.addArguments(str.toString());
            }
          }
          if (option.get("extensions") != null) {
            List<Object> list = (List<Object>) option.get("extensions");
            for (Object str : list) {
              chromeOptions.addExtensions(new File(str.toString()));
            }
          }

          if (option.get("mobileEmulation") != null) {
            Map<String, Object> mobileEmulation = (Map<String, Object>) option.get("mobileEmulation");
            chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
          }

          if (option.get("prefs") != null) {
            Map<String, Object> prefs = (Map<String, Object>) option.get("prefs");
            chromeOptions.setExperimentalOption("prefs", prefs);
          }

          if (option.get("binary") != null) {
            List<Object> list = (List<Object>) option.get("binary");
            for (Object str : list) {
              chromeOptions.setBinary(str.toString());
            }
          }
          single.remove();
        }
      }
    }
  }

  @Override
  protected void setupWebDriverManager() {
    log.debug("Chrome browser version from EnvironmentsSettings = " + settings.getBrowserVersion());

    WebDriverManager chromeDriver = WebDriverManager.chromedriver();
    String chromeDriverLocation = PathUtil.getInstance().getRootPath() + "/web-drivers";
    log.debug("chromeDriverLocation = " + chromeDriverLocation);
    chromeDriver.cachePath(chromeDriverLocation).setup();

    log.info("Downloaded ChromeDriver version = " + chromeDriver.getDownloadedDriverVersion());
    log.info("ChromeDriver downloaded location = " + chromeDriver.getDownloadedDriverPath());
  }
}
