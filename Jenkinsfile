pipeline{
  agent any
  stages{
            stage("build"){
              steps{
                echo "Building project"
              }
            }

            stage("integrate"){
              steps{
                echo "Integrating..."
              }
            }

            stage("deploy"){
              steps{
                echo "Deploying..."
              }
            }

            stage("test"){
              parallel{
                          stage("unit test"){
                            steps{
                              echo "Unit Testing"
                              for i in range{1..50}; do
                                echo "unit testing"
                                sleep 1
                              done
                            }
                          }

                          stage("integration test"){
                            steps{
                              echo "Integration Testing"
                              for i in range{50..100}; do
                                echo "integrate testing"
                                sleep 2
                              done
                            }
                          }
              }
            }
  }
  post{
      always{
        echo "Run always"
      }
    }
}
