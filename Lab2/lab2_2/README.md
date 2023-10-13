# Lab 2.2 Notes

### 1-Step
    Create a new jakarta EE aplication based on Web Profile (in the guide pdf is provided a image with it specified for intellij)

### 2-Step
    Follow this link --> https://www.jetbrains.com/help/idea/docker-tutorial-tomcat-debug.html#clone_sample_project

    The source code of the application is hosted on GitHub at https://github.com/IdeaUJetBrains/Tomcat_docker_debug
        We only need the docker-compose.yaml file

    Continue to follow the guide (Build the .war file (your application packaged as a Web Archive))
    In alternative u can run
        ```
        $ mvn install
        ```
        
    All being complete run 
        ```
        Docker compose up (sudo may be required)
        ```

### 3-Step
    Open browser in this page --> http://127.0.0.1:8888/JakartaWebStarter-1.0-SNAPSHOT/hello-servlet (?username= optional)

