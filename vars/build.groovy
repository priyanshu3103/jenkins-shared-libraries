def call(String DockerHubUser, String ProjectName, String ImageTag){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  echo "Image build successfully"
} 
