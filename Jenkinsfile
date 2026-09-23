pipeline {
    agent any
    tools {
        maven 'Maven 3.9.16' // Use the exact name you gave it in Jenkins Tools config
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/keshikast/jenkins-java-prac.git'
            }
        }
        /*stage('Prepare') {
           steps {
                sh 'cp /Users/keshikasubhashinithirumurugan/jenkins-java-prac/HelloJenkins.java .'
            }
        }*/
        stage('Build') {
            steps {
                sh 'mvn -B clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn -B test'
            }
        }
    }
}
