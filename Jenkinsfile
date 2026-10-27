
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
                    sh 'chmod +x mvnw'
                    sh './mvnw clean package -DskipTests'
                }
            }
        }

        stage('Build QuizService') {
            steps {
                dir('QuizService') {
                    sh 'chmod +x mvnw'
                    sh './mvnw clean package -DskipTests'
                }
            }
        }
    }

    post {
        success {
            echo 'Both microservices built successfully!'
        }

        failure {
            echo 'Build failed. Check Console Output.'
        }
    }
}
