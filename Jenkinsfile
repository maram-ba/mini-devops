pipeline {
    agent any

    tools {
        maven 'Maven3'  // correspond au nom que tu as mis dans Jenkins Tools
        jdk 'Java17'    // correspond au JDK configuré
    }

    environment {
        SONAR_TOKEN = credentials('sonar-token')   // le token que tu as ajouté
        GITHUB_TOKEN = credentials('github-token') // ton token GitHub
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/maram-ba/mini-devops.git',
                    credentialsId: 'github-token'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                sh "mvn sonar:sonar -Dsonar.login=${SONAR_TOKEN}"
            }
        }

        stage('Deploy') {
            steps {
                echo 'Déploiement sur Tomcat ici'
                // sh 'cp target/mini-devops.war /chemin/vers/tomcat/webapps/'
            }
        }
    }
}
