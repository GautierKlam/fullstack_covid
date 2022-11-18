pipeline{
    agent any
    stages{
        
        stage('build'){
            steps {
              sh 'javac Main.java'
            }
        }
        stage('run'){
            steps {
                sh 'java Main'
            }
        }
    }
}