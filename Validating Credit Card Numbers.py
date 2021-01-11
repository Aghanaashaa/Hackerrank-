#You and Fredrick are good friends. Yesterday, Fredrick received  credit cards from ABCD Bank. He wants to verify whether his credit card numbers are valid or not. You happen to be great at regex so he is asking for your help!
#A valid credit card from ABCD Bank has the following characteristics:
#It must start with a ,  or .
# It must contain exactly  digits.
# It must only consist of digits (-).
# It may have digits in groups of , separated by one hyphen "-".
# It must NOT use any other separator like ' ' , '_', etc.
#It must NOT have  or more consecutive repeated digits.

import re
for i in range(int(raw_input())):
    S = raw_input().strip()
    pre_match = re.search(r'^[456]\d{3}(-?)\d{4}\1\d{4}\1\d{4}$',S)
    if pre_match:
        processed_string = "".join(pre_match.group(0).split('-'))
        final_match = re.search(r'(\d)\1{3,}',processed_string)
        print 'Invalid' if final_match else 'Valid'
    else:
        print 'Invalid'
