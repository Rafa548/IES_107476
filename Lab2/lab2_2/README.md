# Lab 2.2 Notes

## Step 1: Create a Jakarta EE Application

1. Create a new Jakarta EE application based on the Web Profile. You can refer to the provided image in the guide PDF for specific instructions in IntelliJ.

## Step 2: Set Up Docker Environment

1. Follow the instructions in this [link](https://www.jetbrains.com/help/idea/docker-tutorial-tomcat-debug.html#clone_sample_project) to set up the Docker environment.

2. The source code for the application is hosted on GitHub at [https://github.com/IdeaUJetBrains/Tomcat_docker_debug](https://github.com/IdeaUJetBrains/Tomcat_docker_debug). You only need the `docker-compose.yaml` file.

3. Continue to follow the guide to build the .war file (your application packaged as a Web Archive). Alternatively, you can run the following command:
```bash
mvn install
```



4. After completing the steps above, run the following command:
```bash
docker-compose up
```


(Note: You may need to use `sudo` for this step.)

## Step 3: Test the Application

1. Open your web browser and navigate to the following page:
[http://127.0.0.1:8888/JakartaWebStarter-1.0-SNAPSHOT/hello-servlet](http://127.0.0.1:8888/JakartaWebStarter-1.0-SNAPSHOT/hello-servlet)
   (You can optionally include a `?username=` parameter.)

