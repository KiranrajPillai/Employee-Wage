#! /bin/bash -x
IS_PRESENT_FULL_TIME=1
IS_PRESENT_HALF_TIME=2
EMP_RATE_PER_HR=20
empcheck=$((RANDOM%3))
case $empCheck in
$IS_PRESENT_FULL_TIME) empHrs=8
;;
$IS_PRESENT_HALF_TIME) empHrs=4
;;
*)empHrs=0
;;
esac
salary=$(( empHrs * EMP_RATE_PER_HR ))
