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

        stage('Test Log') {
          steps {
            sh 'mvn  --version'
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