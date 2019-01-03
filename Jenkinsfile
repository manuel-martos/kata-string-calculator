pipeline {
  stages {
    stage('test') {
      parallel {
        stage('test') {
          steps {
            sh 'echo testing'
          }
        }
        stage('version') {
          steps {
            sh 'echo version'
          }
        }
      }
    }
    stage('merge') {
      steps {
        sh 'echo merge'
      }
    }
  }
}
