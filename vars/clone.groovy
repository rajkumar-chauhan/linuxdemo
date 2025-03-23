def call(string url,string branch ){
   echo "cloning the code "
   git url: "${url}" , branch: "${branch}"  ## yha hm isko varsblises kr rhe h jaise hmne string url dia h usko hm git url ki jgh variablises kr k url dal de 
   echo "code cloning successfully "
}
