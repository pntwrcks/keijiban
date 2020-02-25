<?php
mb_internal_encoding("utf8");

$pdo = new PDO("mysql:dbname=4each;host=localhost;","root","mysql");
$resuit = $pdo->query("select image from img_upload");

foreach ($resuit as $row) {
    $uploaded_img = $row["image"];}

$image_path="./image/".$uploaded_img;

?>

<!DOCTYPE html>
<html>
    <head>
       <meta charset="UTF-8">
       <title>画像アップロード</title> 
    </head>
    
    <body>
        <img src="<?php echo $image_path; ?>">
        
    </body>
</html>
        