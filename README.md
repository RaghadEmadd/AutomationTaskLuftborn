# AutomationTaskLuftborn
The web test automation project code

1- The maven project is created through POM design pattern where each page has its separate web elements and the functions performed through these elements such as clicking on an element, passing data into search field, or even waiting for a specific element to be visible in order to continue the rest of the test script. The reports were generated through allure dependency added in the pom.xml file.
2- In order to validate the correct homepage navigation, it was done through "title" validation and for search results page, I used explicit wait to wait for a certain element to be displayed on the page before continuing the script.
3- Allure-reports folder gets created after running the test runner file, feel free if you want to delete it and re-running the test runner file to display newer results.

# Important note:
The code includes the steps as mentioned in the task, however I would like to mention that earlier the code was running perfectly well and displaying all expected results. but after
re-running the same scenario one final time before submission, the results returned through eBay website were different, also, the "Transmission" tab is no longer displayed on the left handside after scrolling which affected the results as displayed in the allure report and the screen record as well.
