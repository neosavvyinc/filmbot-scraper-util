dbScript=`ls /FILMBOT/filmbot-server-backup/db | grep filmbot | grep production | tail -n1`
echo "Restoring database from: " $dbScript
mysql -u root -p filmbot_20_development < /FILMBOT/filmbot-server-backup/db/$dbScript
