pipeline{
  agent any
  stages{
    stage("build"){
      steps{
        echo "Building project"
      }
    }
    stage("test"){
      steps{
        echo "Testing..."
      }
    }
    stage("deploy"){
      steps{
        echo "Deploying..."
      }
    }
    post{
      always{
        echo "Run always"
      }
    }
  
  }
}
