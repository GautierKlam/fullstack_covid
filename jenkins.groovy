pipeline{
    agent any
    stages{
        
        stage('build'){
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