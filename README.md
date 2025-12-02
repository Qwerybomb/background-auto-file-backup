# __This is a customizable file backup program by Qwerybomb__

The use of this program is for backup convenience 


## H2 Instructions for Building and initializing

* Clone respoistory and build into a jar
* recommended to use something like a .bat file or shell script to run on startup
* Make sure to run using javaw if using the jar


## H2 Instructions for use

* on startup the jar ( or application, whichever you've chosen) will create a settings file.
* In the settings file
    * there can only be __ONE__ target directory
    * There can be an __UNLIMITED__ amount of source directories (within reason)
       * __In this aspect make sure all file paths (example C:/Document/) includes the / at the end for both target and source__
    * The backup interval in hours can be changed by altering the number after the / in __HOURS ELAPSED__.
  
| Setting | Description |
| ----------- | ----------- |
| ░▒▓ Target Directories: | The directories to back up from |
| ░▒▓ Backup directory | the __SINGLE__ directory to backup the files to |
| ░▒▓ Hours elapsed until update | An indicator of how many hours elapsed and how many until file backup |
