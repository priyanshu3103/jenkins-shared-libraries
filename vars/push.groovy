def push(String DockerHubUser, String projectname, String imagetag){
  echo "Pushing image on github....."
  withCredentials([usernamePassword('credentialsId':"DockerHubCred", passwordVariable:"DockerHubPass", usernameVariable:"DockerHubUser")]){
      sh "docker login -u ${DockerHubUser} -p ${DockerHubPass}"
      sh "docker image tag systemutil:02 ${DockerHubUser}/${projectname}:${imagetag}"
      sh "docker push ${DockerHubUser}/${projectname}:${imagetag}"
      echo "Login successed and Image push successfully on DockerHub"
  }
}
