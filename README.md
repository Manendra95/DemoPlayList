# DemoPlayList Java code
Maven is a software project management and comprehension tool, so in other words it can be used to manage all software cycle. This software it helps me a lot in my works and personal projects and in this post I try to share some knownledge and information that I learned.

I create a simple project available that cover most of the maven lifecycle. I hope it will help you on your job or personal project(s).

# How to build
In order to execute build my example you have two way:

Maven CLI (Command Line Interface). In this case you need to install maven see here for more details. Here the instruction:

Clone git repository or download the maven project

Open terminal or your prompt and navigate to maven example project (you must go inside the folder)

Execute the following command: mvn clean install

Go to "How To execute" in order to execute the program

Eclipse - The following instructions are tested for Eclipse Mars (version 4.5).

Clone git repository or download the maven project

Start eclipse

Import maven project into eclipse by select "File" → "Import..."

Write "maven" in "Select an import source" field, select "Existing Maven Projects" and then click on "Next >"

Browse to the directory where you save the project and then click on "Finish"

Click with the right mouse button on the root project and select "Run As" → "Maven build"

Write "clean install" in "Goals" input field, then click on "Apply" and finally click on "Run"

Go to "How To execute" in order to execute the program

# How to execute
Open terminal or your prompt and navigate to maven DemoPlayList (you must go inside the folder)
Execute the following command (replace '/' with '' if you are on windows environment): java -jar ./target/DemoPlayList.jar
