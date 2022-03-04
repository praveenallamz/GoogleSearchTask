pipeline {
  agent any
  stages {
    stage('check for pom') {
      parallel {
        stage('check for pom') {
          steps {
            fileExists 'pom.xml'
          }
        }

        stage('Log Tool Version') {
          steps {
            sh '''mvn --version
java -version'''
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