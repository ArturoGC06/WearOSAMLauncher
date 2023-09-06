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

### Continue using a PC: ([click here](https://github.com/ArturoGC06/WearOSAMLauncher) if you are going to use your phone)
### 2. Connect to the watch
Extract the downloaded .zip file and open a command line there (make sure to open it in the folder that contains the adb programm). On the command window, type
```cmd
adb connect [IP ADRESS]
```
Where [IP ADRESS] is the previously noted IP adress from step 1. The command should be something similar to adb connect 192.168.1.50. The watch will prompt to allow debigging, tap "always from this computer".

### 3. Install the APKs
Type
```cmd
adb install [PATH TO THE APK]
```
Where [PATH TO THE APK] is the path to the downloaded APKs (you can just swipe the APK to the command windows to copy its path), make sure to do it with both the WearOSAMLauncher you downloaded from [releases](https://github.com/ArturoGC06/WearOSAMLauncher/releases) and the Apple Music app you downloaded from [APK Mirror](https://www.apkmirror.com/apk/apple/apple-music/).

### 4. Low the DPI to be able to log in
Before opening Apple Music type 
```cmd
adb shell wm density 200
```
This will make everything smaller to be able to log in into Apple Music, but don't worry, we will set it back to the default size after loggin in.

### 5. Open Apple Music and log in

Now open AMLauncher in the watch (the app you just installed with the watch icon, not Apple Music itselft), Apple Music should launch automatically, if not click on the "Open Apple Music" button.

You will notice that you can't accept the diagnostic dialog, but just swipe from the left border to the right to dimiss it. If a connection error is should, disable the watch bluetooth and make sure it's connect to either a Wifi network or mobile data.

Then tap on the left button of the navigation bar, after that tap on the upper right side of the screen where the three dots should be (you might need to tap a couple of times until you find the button) and tap on "Settings", then "Log in".

![Banner2 Github](https://github.com/ArturoGC06/WearOSAMLauncher/assets/76574534/cd33d68b-18d0-4b5a-a21f-174cf2d336fc)

You will see the log in menu off screen, but just scroll the text at the top that says "Log in with your Apple ID" and you will see the fields to enter your ID and password, enter them and tap "Log in", then enter the verification code that should be sended to either your Apple devices or your phone via SMS.

### 5. Reset the DPI

Finally, type
```cmd
adb shell wm density reset
```
To reset the DPI size and make everything look at its original size.

### 6. Enjoy!

You should now be able to use Apple Music on your Wear OS device, just open it always from WearOSAMLauncher not directly from Apple Music, or it won't start.

### Things to keep in mind:
- Apple Music will think you don't have internet if the watch is using the phone connection via bluetooth, it will only work if the watch is connected to either Wifi or mobile data, although you should be able to download your music to listen it without connection.
- This has been tested on One UI Watch 4.5 Wear OS 3, One UI Watch 5 Wear OS 4 and stock Wear OS 2, 3 and 4 and it works fine, although Wear OS 4 is known to have made the adb pairing process harder.
- At least on One UI Watch, Apple Music will crash if you try to open the music player from the watchface. Control the music from the app itselft.
- If you find any bug help me fix it by opening an issue at the repo reporting it.
- If this app is useful to you, you might want to [buy me a cofee](https://paypal.me/agcarbajo1), I'll be very greatful!
