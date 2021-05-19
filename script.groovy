def buildApp(){
  echo "Building app..."
}

def testApp(){
  echo "Testing app..."
}

def deployApp(){
  echo "Deploying app..."
  echo "Deploying version ${params.VERSION}"
}

return this
