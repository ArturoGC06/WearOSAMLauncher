# Apple Music Launcher for Wear OS

## Use Apple Music on your Wear OS device

### How does it work:
Apple Music crashes on start if you sideload it to a Wear OS device, unless you open a specific activity of the app, which is what this app does.

![Banner-Github](https://github.com/ArturoGC06/WearOSAMLauncher/assets/76574534/a175efca-1c89-4f55-aebd-a37378da8249)

## How to install it:

### Prerequisites:
- Your phone or a PC
- Download the latest WearOSAMLauncher APK from [releases page](https://github.com/ArturoGC06/WearOSAMLauncher/releases)
- Download the latest Apple Music version from [APK Mirror](https://www.apkmirror.com/apk/apple/apple-music/) (make sure to dowload the APK, not the bundle)
- Make sure that both the watch and the phone or PC are connected to the same Wifi network (you can force the watch to connect to Wifi turning off the Bluetooth from it)

Depending on what device you are going to use to follow the guide:
- [If you are going to use your phone] Download the [Bugjaeger app](https://play.google.com/store/apps/details?id=eu.sisik.hackendebug) on your phone
- [If you are going to use your PC] Download the [Platform tools](https://developer.android.com/tools/releases/platform-tools#downloads) for your OS.

### 1. Enable ADB debugging on the watch
Open settings on the watch and scroll down to "About watch", then "Software info" and tap seven times on "Software version", then go back to settings main menu and at the bottom you will find a new option called "Developer settings", open them and scroll down until you find "ADB debugging", enable it and enable "Wifi debugging", once you enable it some text should appear on the same option, write down the last line that should be an IP adress, if it doesn't appear, make sure that your watch is connected to Wifi and try it again.
