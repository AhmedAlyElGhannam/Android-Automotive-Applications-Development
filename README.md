# Android-Automotive-Applications-Development

## Android Auto Display Head Unit Setup
### Phone Side
1. Update Android Auto app.
2. Open App Settings.
3. Scroll down to version, click it several times until you unlock Developers' settings.
4. Click on the 3 dots at the top right corner and choose Developer Settings.
5. Click on Android Mode, choose Developer.
6. Enable Unknown Resources.
7. Go back, Then click on the 3 dots at the top right corner and Start Head Unit Server.

### PC Side
1. Install Dependencies:
```
sudo apt-get install libc++1 libc++abi1
```
2. Install adb if it is not installed:
```
sudo apt install adb
```
3. Create an alias for the commands required to launch DHU in .bashrc:
```
alias dhu='adb forward tcp:5277 tcp:5277 && /home/$USER/Android/Sdk/extras/google/auto/desktop-head-unit'
```
4. Source .bashrc:
```
source ~/.bashrc
```
5. Launch DHU:
```
dhu
```
