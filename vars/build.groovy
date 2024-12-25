def build(String DockerHubUser, String ProjectName, String ImageTag){
  sh "docker build ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  echo "Image build successfully"
} 
