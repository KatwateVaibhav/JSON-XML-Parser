#Given is hotel data distributed in five xml files and one json file. Write a converter, that creates one json document out of those files. All contents of the xml files should be included in the one json file, but there should not be duplicates. Download Images that are referenced inside the files (only images).

-- bofore running the project, create data folder the same level as this file and put the xml files and json files there. By default I've put them! 

-- use "mvn clean package" to run the tests and see the final file "output.json" and "images" folder.
Or
-- use "java -jar target/freshcells-task.jar" command to run project without need to run maven commands.

TODO: Get the Data foldre's path from commandline, scan the folder and read all the xml and json files inside it authomatically, without being need to hard-code the file names in program! Due to lack of time, I haven't done this.
