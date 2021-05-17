pipeline{
  stages{
    stage("build"){
      echo "Building project"
    }
    stage("test"){
      echo "Testing..."
    }
    stage("deploy"){
      echo "Deploying..."
    }
    post{
      always{
        echo "Run always"
      }
    }
  
  }
}
