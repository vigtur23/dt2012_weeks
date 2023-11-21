import argparse
import json

parser = argparse.ArgumentParser(
        prog='AuthChecker',
        description='Script that auto checks java code')
parser.add_argument('config_file')
parser.add_argument('--configure', action='store_true')
args = parser.parse_args()

if args.configure:
    config = json.loads("[]")
else:
    print("Implement to read from file")
