pipeline{
    agent any
    stages{
        
        stage('Gradle build'){
            steps {
              sh 'gradle build'
            }
        }
        stage('run'){
            steps {
                sh 'gradle bootRun'
            }
        }
    }
}