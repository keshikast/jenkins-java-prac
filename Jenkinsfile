pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/keshikast/jenkins-java-prac.git'
            }
        }
        stage('Prepare') {
           steps {
                sh 'cp /Users/keshikasubhashinithirumurugan/jenkins-java-prac/HelloJenkins.java .'
            }
        }
        stage('Build') {
            steps {
                sh 'javac HelloJenkins.java'
            }
        }

        stage('Run') {
            steps {
                sh 'java HelloJenkins'
            }
        }
    }
}
