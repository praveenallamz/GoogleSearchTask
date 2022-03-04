pipeline {
  agent any
  stages {
    stage('Log Tool Version') {
      parallel {
        stage('Log Tool Version') {
          steps {
            sh '''mvn  --version
java  -version'''
          }
        }

        stage('check for pom') {
          steps {
            fileExists 'pom.xml'
          }
        }

      }
    }

    stage('build with maven') {
      steps {
        sh 'mvn compile test package'
      }
    }

    stage('post build steps') {
      steps {
        writeFile(file: 'status.txt', text: 'Hey It Worked Successfully')
      }
    }

  }
}