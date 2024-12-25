def call(String DockerHubUser, String projectname, String imagetag){
  echo "Pushing image on github....."
  withCredentials([usernamePassword('credentialsId':"DockerHubCred", passwordVariable:"DockerHubPass", usernameVariable:"DockerHubUser")]){
      sh "docker login -u ${DockerHubUser} -p ${DockerHubPass}"
      sh "docker push ${DockerHubUser}/${projectname}:${imagetag}"
      echo "Login successed and Image push successfully on DockerHub"
  }
}
