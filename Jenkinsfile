pipeline {
    agent any

    stages {
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
