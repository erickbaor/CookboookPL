<?php

// first way - traditional array
$names = ['John', 'Ivar', 'Liam', 'Stephen'];
echo $names[3]."<br><br>";

// second way - associative array
$names_opt = array(
  'sa' => 'Stephen Amell',
  'io' => 'Ivar Ortiz',
  'ln' => 'Liam Neeson'
);

echo $names_opt['io'];