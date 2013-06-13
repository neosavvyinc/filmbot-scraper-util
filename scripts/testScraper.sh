dbScript=`ls /FILMBOT/filmbot-server-backup/db | grep filmbot | tail -n1`
echo "Restoring database from: " $dbScript
mysql -u root -p filmbot_20_development < /FILMBOT/filmbot-server-backup/db/$dbScript

echo "Copying the assets"
cp -R /FILMBOT/filmbot-server-backup/media /FILMBOT/filmbot/

java -jar /FILMBOT/filmbot-scraper-utl/target/scraper-1.0.jar

#mysql -u root -p < ./sql/approveAllFilms.sql