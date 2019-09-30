#When squirrels get together for a party, they like to have cigars. A squirrel paryt is successful when the number of cigars is between 40 and 60. Unless it is a weekend, in which case there is no upper bound on the number of cigars. Return True if the party with the given values is successful, or False otherwise.
def cigar_party(cigars,is_weekend):
    if is_weekend and cigars >= 40:
        return True
    elif 40<=cigars<=60:
        return True
    return False