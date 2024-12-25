def call(String url, String branch){
  echo "Clonning the app....."
  git url: "${url}", branch: "${branch}"
  echo "Successfully cloned"
}
