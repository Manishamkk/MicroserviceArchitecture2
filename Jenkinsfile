pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Manishamkk/MicroserviceArchitecture2.git'
            }
        }

        stage('Build QuestionService') {
            steps {
                dir('QuestionService') {
                    sh 'mvn clean package -DskipTests'
                }
            }
        }

        stage('Build QuizService') {
            steps {
                dir('QuizService') {
                    sh 'mvn clean package -DskipTests'
                }
            }
        }
    }
}
