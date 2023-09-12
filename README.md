# Apple Music Launcher for Wear OS

## Use Apple Music on your Wear OS device

### How does it work:
Apple Music crashes on start if you sideload it to a Wear OS device, unless you open a specific activity of the app, which is what this app does.

![Banner-Github](https://github.com/ArturoGC06/WearOSAMLauncher/assets/76574534/a175efca-1c89-4f55-aebd-a37378da8249)

## How to install it using a phone (go [here](https://github.com/ArturoGC06/WearOSAMLauncher/blob/main/PC.md) if you want to use a PC):

### Prerequisites:
- Your phone
- Download the latest WearOSAMLauncher APK from [releases page](https://github.com/ArturoGC06/WearOSAMLauncher/releases)
- Download the latest Apple Music APK from [APK Mirror](https://www.apkmirror.com/apk/apple/apple-music/) (make sure to dowload the APK, not the bundle)
- Download the [Bugjaeger app](https://play.google.com/store/apps/details?id=eu.sisik.hackendebug) on your phone
- Make sure that both the watch and the phone are connected to the same WiFi network (you can force the watch to connect to WiFi by turning off its Bluetooth)

### 1. Enable ADB debugging on the watch
Open settings on the watch and scroll down to "About watch", then "Software info" and tap seven times on "Software version", then go back to settings main menu and at the bottom you will find a new option called "Developer settings". Open this and scroll down until you find "ADB debugging", enable it and enable "WiFi debugging". Once you enable it some text should appear on the same option. Write down the last line which should be an IP address; if it doesn't appear, make sure that your watch is connected to WiFi and try again.

### 2. Connect to the watch
Open Bugjaeger on your phone, agree to the terms when prompted and tap the plug icon with a + at the top right side of the screen. A window will appear with two fields. Edit the one that says "192.168.0.1" with the previously noted IP address from step 1 and tap "connect". The watch will prompt to allow debugging, then tap "always from this computer".

### 3. Install the APKs
Tap the third tab of the navigation bar in Bugjaeger (the one with a square icon and an arrow), then the + icon from the right down side of the screen. Tap "Select APK file" when promped and select both the [WearOSAMLauncher APK](https://github.com/ArturoGC06/WearOSAMLauncher/releases) and the [Apple Music APK](https://www.apkmirror.com/apk/apple/apple-music/) and they will start installing; wait until it finishes.

### 4. Lower the DPI to be able to log in
Before opening Apple Music, go back to the first tab of the navigation bar (the one with an icon with lines) and tap the <> icon at the bottom right side of the screen. A console will appear, type
```cmd
wm density 210
```
and press enter. This will make everything smaller to be able to log in into Apple Music, but don't worry as we will set it back to the default size after logging in.

### 5. Open Apple Music and log in

Now open AMLauncher on the watch (the app you just installed with the watch icon, not Apple Music itself) and Apple Music should launch automatically. If not click on the "Open Apple Music" button.

You will notice that you can't accept the diagnostic dialog, but just swipe from the left border to the right to dismiss it. If a connection error is shown, disable bluetooth on the watch and make sure it connects to either a WiFi network or mobile data.

Then tap on the left button of the navigation bar, after that tap on the upper right side of the screen where the three dots should be (you might need to tap a couple of times until you find the button, if you still can't tap it, run the command in step 4 with a slightly higher DPI like 220 and keep trying) and tap on "Settings", then "Log in".

![Banner2 Github](https://github.com/ArturoGC06/WearOSAMLauncher/assets/76574534/cd33d68b-18d0-4b5a-a21f-174cf2d336fc)

You will see the log in menu off screen, but just scroll the text at the top that says "Log in with your Apple ID" and you will see the fields to enter your ID and password. Enter them and tap "Log in", then enter the verification code that should be sent to either your Apple devices or your phone via SMS.

### 5. Reset the DPI

Finally, type
```cmd
wm density reset
```
on the console to reset the DPI size so everything appears as they originally did.

### 6. Enjoy!

You should now be able to use Apple Music on your Wear OS device. Just open it always from WearOSAMLauncher not directly from Apple Music, or it won't start.

### Things to keep in mind:
- Apple Music will think you don't have internet if the watch is using the phone connection via bluetooth, it will only work if the watch is connected to either Wifi or mobile data, although you should be able to download your music to listen without connection.
- This has been tested on One UI Watch 4.5 Wear OS 3, One UI Watch 5 Wear OS 4 and stock Wear OS 2, 3 and 4 and it works fine, although Wear OS 4 is known to have made the adb pairing process harder.
- At least on One UI Watch, Apple Music will crash if you try to open the music player from the watchface. Control the music from the app itselft.
- If you find any bug help me fix it by opening an issue at the repo reporting it.
- If this app is useful to you, you might want to [buy me a coffee](https://paypal.me/agcarbajo1), I'll be very grateful!
