pipeline {
    // master executor should be set to 0
    agent any
    stages {
        stage('Build Jar') {
            steps {
                //sh
                 sh "mvn clean package -DskipTests"
		//  cmd_exec('mvn clean package -DskipTests')
            }
        }
        stage('Build Image') {
            steps {
                //sh
                 sh "docker build -t vinsdocker/selenium-docker ."
		 //   cmd_exec('docker build -t vinsdocker/selenium-docker .')
            }
        }
        stage('Push Image') {
            steps {
			    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'Test@123321!', usernameVariable: 'asmitaprabhune')]) {
                    //sh
			        sh "docker login --username=${user} --password=${pass}"
			        sh "docker push vinsdocker/selenium-docker:latest"
				    
		   // cmd_exec('docker login --username=${user} --password=${pass}')
		   // cmd_exec('docker push vinsdocker/selenium-docker:latest')
				  
			    }
            }
        }
    }
}
