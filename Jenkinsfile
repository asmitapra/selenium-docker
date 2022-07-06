pipeline {
    // master executor should be set to 0
    agent any
    stages {
        stage('Build Jar') {
            steps {
                //sh
                bat "mvn clean package -DskipTests"
            }
        }
        stage('Build Image') {
            steps {
                //sh
                bat "docker build -t='vinsdocker/selenium-docker' ."
            }
        }
        stage('Push Image') {
            steps {
			    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'Test@123321!', usernameVariable: 'asmitaprabhune')]) {
                    //sh
			        bat "docker login --username=${user} --password=${pass}"
			        bat "docker push vinsdocker/selenium-docker:latest"
			    }
            }
        }
    }
}