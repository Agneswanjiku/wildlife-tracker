# wildlife-tracker
WildLife Tracker: An app that aims at tracking the wildlife numbers at a local animal park, Rangers are able to spot animals, both endangered and non-endangered then record them in a sightings record. heroku live link https://agneswildlifetracker.herokuapp.com/
![Screenshot from 2020-07-21 10-35-54](https://user-images.githubusercontent.com/63198747/88026336-64eebd80-cb3e-11ea-826d-abc171610386.png)

image of animal form

![Screenshot from 2020-07-21 10-45-50](https://user-images.githubusercontent.com/63198747/88027063-708eb400-cb3f-11ea-9b25-754c45eb4d6f.png)

image of endAngered form
![Screenshot from 2020-07-21 10-48-41](https://user-images.githubusercontent.com/63198747/88027376-d3804b00-cb3f-11ea-9d45-e488a1177ff7.png)


sighting image
![Screenshot from 2020-07-21 10-57-13](https://user-images.githubusercontent.com/63198747/88028285-1c84cf00-cb41-11ea-9038-6d7ca62b0eec.png)

<BR>SQL<BR>
  
  
  
1.Launch postgres<br>
2.Type in psql<br>
Run these commands<br>
3. CREATE DATABASE Wildlife_tracker;<br>
4. \c Wildlife_tracker;<br>
5. CREATE TABLE animals (id serial PRIMARY KEY, name varchar,);<br>
6. CREATE TABLE wildlife_tracker=# CREATE TABLE sightings (id serial PRIMARY KEY, animal_id int, location varchar, ranger_name varchar, timestamp timestamp);<br>
7. CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;<br>


<br>contact details<br>
shikonorman@gmail.com<br>

or<br>

0797089772

Technology used<br>
i used pure java to create the app.


Built With<br>
Java - The language used Intellij Idea - Intergated development Spark - Framework<br>

Contributing<br>
If you want to put out a pull request you first have to send us the sample code that you want to add to our repository for cross-checking before we allow the pull.<br>

Versioning<br>
We use Github for versioning. This is the first version of this application<br>

License This project is licensed under the MIT License - see the LICENSE file for details<br>

Acknowledgments Hat tip to Stackoverflow<br>

LICENCE<br>

MIT License Copyright (c) 2020 Agnes Wanjiku permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions: The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.






