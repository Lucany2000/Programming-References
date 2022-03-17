import string
import random
import pandas as pd
import numpy as np
from openpyxl import Workbook

def word_gen():
    length = random.randrange(5,20)
    result = ''.join((random.choice(string.ascii_letters) for x in range(length)))
    return result

wb = Workbook()
ws = wb.active
ws.append(["Songs", "Artists", "Albums"])
for x in range(2,51):
    ws.append([word_gen(), word_gen(), word_gen()])
wb.save("Songs.xlsx")
df = pd.read_excel("Songs.xlsx")
print(df)