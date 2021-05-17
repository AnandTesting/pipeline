pipeline{
  agent any
  stages{
    stage("build"){
      steps{
        echo "Building project"
      }
    }
    stage("integrating"){
      steps{
        echo "Integrating..."
      }
    }
    stage("deploy"){
      steps{
        echo "Deploying..."
      }
    }
  }
  stage("test"){
    parallel{
                stage("unit test"){
                  echo "Unit Testing"
                  sh "sleep 20"
                }
                stege("integration test"){
                  echo "Integration Testing"
                  sh "sleep 15"
                }
    }
  }
  post{
      always{
        echo "Run always"
      }
    }
}
