pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'jdk11'
    }
    stages {
        stage('Initialize') {
            steps {
                bat '''
                    echo "PATH = ${PATH}"
                    echo "JAVA_HOME" = ${JAVA_HOME}
                    echo "MAVEN_HOME = ${MAVEN_HOME}"
                '''
            }
        }
        stage('Build') {
            steps {
                echo 'BUILD'
            }
        }
        stage('Test') {
            steps {
                echo 'TEST'}
        }
        stage('Package') {
            steps {
                echo 'PACKAGE'
            }
        }
        stage('Deploy') {
            steps {
                echo 'DEPLOY'
            }
        }
    }
}
