# widget-onesignal-auto-update
Isolating effect on widget updates that seems to be related with OneSignal

To reproduce the effect:

- clone the project
- install the app
- add the widget - go home screen and hold an empty area, search for "BlankProject" widget and add it
- run the project - run in debug mode with a breakpoint in WidgetProvider class to make the process quicker like in the image below:

![image](https://user-images.githubusercontent.com/87457216/166112965-7be1705d-9afd-42fd-9540-9dd8a012098e.png)

- with this proccess we can see that the breakpoint is called multiple times when opening and closing the app once OneSignal is initialized:

![image](https://user-images.githubusercontent.com/87457216/166113004-9b02c667-1036-45ec-ab62-a3ee524eb37d.png)

- simply doing this the widget updates as normally:

![image](https://user-images.githubusercontent.com/87457216/166113041-aa737df7-f999-4c33-b0de-0c8515a283be.png)

