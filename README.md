# Reminders - GUI app for managing reminders

Main scope of the project is managment, meaning adding, editing, deleting and searching reminders.

Project is written in Java using JavaFx framework and MySql with phpMyAdmin tool.

There are 2 main parts. First part is Login part.
![](/Screens/Login.png)

If user put wrong password, exception is catched and system will pop up error message window, also when user is not registered.
Users are yet registered by manual addition into database in phpMyAdmin tool.
If system finds user in database, login is successful and new window will pop up.

![](/Screens/main.png)
This is main window. Window contains pop up menu with functions (which allows user execute operations over his reminders) and
actual logged user.

First function is addition of the reminder.
![](/Screens/Addition.png)
User then can edit or delete his reminders
![](/Screens/Edit.png)
There is also search function where user can find specific reminder.
