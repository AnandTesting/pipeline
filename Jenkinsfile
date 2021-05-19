def gv
pipeline{
  agent any
  parameters{
      choice(name:'VERSION', choices: ['1.1.0', '1.2.0'], description:'Select Version')
  }
  stages{
            stage("init"){
              steps{
                script{
                    gv=load "script.groovy"
                }
              }
            }

            stage("building"){
              steps{
                script{
                    gv.buildApp()
                }
              }
            }

            stage("testing"){
              steps{
                script{
                    gv.testApp()
                }
              }
            }

            stage("deploying"){
              steps{
                  script{
                      gv.deployApp()
                }
            }
    }
  }
  post{
      always{
        echo "Run always"
      }
      success{
          echo "Success"
      }
      failure{
          echo "Failure"
      }
    }
}
