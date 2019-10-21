# CS 1632 - Software Quality Assurance

## Exercise 3

For this assignment, you and a partner will write a systems-level, automated black-box tests for the Reddit website using the Katalon Automation Recorder.  Specifically, we are going to test the r/cats subreddit at:

https://www.reddit.com/r/cats/

It was chosen because it is a nice safe subreddit which is policed pretty well.  Besides, it's cats.

I recommend you try a minimum of seven tests, one for each requirement listed in requirements.md.  

Remember, each test must end with an assertion!  The list of available assertions and other commands are available at:

https://docs.katalon.com/katalon-recorder/docs/selenese-selenium-ide-commands-reference.html

## Tips

Sometimes your test case will not work as expected.  Here are a few hints on how to debug a problem:

1. Check the Log window at the bottom of the Katalon IDE.  It will tell you which step failed for what reason (in red).
1. Select the test step that failed in the main test case window, and then select the Reference tab at the bottom pane of the IDE.  It will display usage instructions for that command.  If you need more information, refer to the link posted above.
1. Try reading Katalon Recorder Samples.html, and executing it after loading it into Katalon.  It is an HTML file so is readable on a web browser.  It shows you several examples of test scenarios.
1. Remember that assertText can take a regular expression as its Value parameter.  It can also take a glob.  If you want to use a regular expression, the Value text should begin with "regexp:" or "regexpi:".  If you want to use a glob, the Value text should begin with "glob:".  Here is an explanation with some examples:  
   https://www.seleniumhq.org/docs/09_selenium_ide.jsp#matching-text-patterns  
   Note that often when you do assertText, you are not matching the entire string but searching for a keyword in a longer string.  In order to achieve this, you have to use regexes or globs.
1. Sometimes the target component of a test step is the problem.  The selector button tries to generate a locator string as best it can using xpath, css selector, or id tag.  But it is not fool proof.  The problem is, the web page may change ever so slightly on the next page load (e.g. due to a new post, or a new comment) and then the locator will stop working.  You will notice that there is a small down arrow at the end of the target text box.  If you click on that arrow, you will see alternative locator strings to the current string.  Select the one that looks specific enough to be able to point to the target but also general enough to not change between page loads.  You do need to try this out several times to get a feel of what a good locator string is.  Here is an in-depth discussion about locators:  
   https://www.seleniumhq.org/docs/09_selenium_ide.jsp#locating-elements
1. If you are having trouble locating the target, sometimes it helps to view the HTML source code to see if the locator string is reasonable.
1. Try exporting your test case to Java code by pressing on the Export button at the top.  The format that is most familiar to you is probably Java (WebDriver + JUnit).  It uses Selenium WebDriver in conjunction with JUnit.  Reading the Java code gives you a good sense of what is happening behind the scenes.

## Try this out

If you are interested in trying out the Java (WebDriver + JUnit) code exported from Katalon, I've provided a way to do it.  Try the following:

1. If you are running Windows:
   ```
   cd Windows
   run.bat
   ```
1. If you are running Mac:
   ```
   cd Mac
   run.sh
   ```
1. If you are running Linux:
   ```
   cd Linux
   run.sh
   ```

The above will compile and execute TestRunner.java which tests the SearchSmellyCat.java JUnit test class.  It is code exported from the last test case in the Reddit Cats.html file (my implementation of the test cases).  If things go properly, you will see a chrome browser pop up, perform the actions, and close.  In the command line, you should see "ALL TESTS PASSED" as usual.

You can try running one of your test cases by clicking on the Export button and copying and pasting code into SearchSmellyCat.java.  You should copy and paste only the @Test test method into SearchSmellyCat.java.  The other parts of the Exported code is firefox specific and should be ignored.  Running your test case as Java code really gives you a good sense of what's happening below the covers.  Also, if there is a test case that is particularly hard to nail down just by using Katalon, you can touch it up in the form of exported Java code.  Katalon is a tool to reduce coding effort.  But if coding is more efficient, don't let the tool get in the way!

Fortunately, the website you will test for Deliverable 3 is not very complex and you will not need to export to Java and modify.  Katalon will be good enough.

## Submission

There is no submission for this exercise.  Please practice until you have gained confidence.
 
My test cases are stored at Reddit Cats.html.  Feel free to load them and try them out.  Compare with your test cases and see what's different.  It is in HTML format so you can open it in a browser to view it.  Each test case is summarized in tabular format.
