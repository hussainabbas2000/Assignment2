const frisby = require('frisby');
it('should return status 200', function () {
   return frisby.get('Downloads/reaction-development-platform/reaction/tests/integration/api/mutations/addAccountAddressBookEntry/addAccountAddressBookEntryMutation.graphql')
     .expect("status", 200)
     .expect("graphql","accountId","ID!")
     .expect("graphql","address","AddressInput")
});

it('should return status 200', function () {
  return frisby.get('Downloads/reaction-development-platform/reaction/tests/integration/api/mutations/addAccountEmailRecord/addAccountEmailRecordMutation.graphql')
    .expect("status", 200)
    .expect("graphql","accountId","ID")
    .expect("graphql","email","Email")
});

it('should return status 200', function () {
  return frisby.get('Downloads/reaction-development-platform/reaction/tests/integration/api/mutations/addAccountToGroup/addAccountToGroupMutation.graphql')
    .expect("status", 200)
    .expect("graphql","accountId","ID!")
    .expect("graphql","groupId","ID!")
});

it('should return status 200', function () {
  return frisby.get('Downloads/reaction-development-platform/reaction/tests/integration/api/mutations/addCartItems/addCartItemsMutation.graphql')
    .expect("status", 200)
    .expect("graphql","cartId",'ID!')
    .expect("graphql","cartToken",'String')
});

it('should return status 200', function () {
  return frisby.get('Downloads/reaction-development-platform/reaction/tests/integration/api/mutations/addTag/addTagMutation.graphql')
    .expect("status", 200)
    .expect("graphql","shopId",'ID!')
    .expect("graphql","name",'String!')
});

it('should return status 200', function () {
  return frisby.get('Downloads/reaction-development-platform/reaction/tests/integration/api/mutations/CancelOrderItem/CancelOrderItemMutation.graphql')
    .expect("status", 200)
    .expect("graphql","cancelQuantity",'Int!')
    .expect("graphql","itemId",'ID!')
});


it('should return status 200', function () {
    return frisby.get('Downloads/reaction-development-platform/reaction/tests/integration/api/mutations/RemoveTag/RemoveTagItemMutation.graphql')
    .expect("status", 200)
    .expect("graphql","id","ID!")
    .expect("graphql","shopId","ID!")
});

it('should return status 200', function () {
    return frisby.get('Downloads/reaction-development-platform/reaction/tests/integration/api/mutations/DiscountCode/createDiscountCodeMutation.graphql')
    .expect("status", 200)
    .expect("graphql","shopId","ID!")
    .expect("graphql","discountCode","DiscountCodeInput!")
});

it('should return status 200', function () {
    return frisby.get('Downloads/reaction-development-platform/reaction/tests/integration/api/mutations/DiscountCode/updateDiscountCodeMutation.graphql')
    .expect("status", 200)
    .expect("graphql","shopId","ID!")
    .expect("graphql","discountCodeId",'ID!')
});